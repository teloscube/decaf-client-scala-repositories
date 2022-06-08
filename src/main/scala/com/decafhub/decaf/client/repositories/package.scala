package com.decafhub.decaf.client

import com.decafhub.decaf.client.core.BaristaClient

import scala.language.higherKinds

package object repositories {

  /**
    * Provides a container for all repositories of interest.
    *
    * @param api Remote API client.
    * @tparam F Context type parameter.
    */
  class Repositories[F[_]] (api: BaristaClient[F]) {
    /**
      * Provides the risk profiles repository for the given API client.
      */
    val riskprofiles: RiskProfileRepository[F] = new RiskProfileRepository(api)

    /**
      * Provides the strategies repository for the given API client.
      */
    val strategies: StrategyRepository[F] = new StrategyRepository(api)

    /**
      * Provides the institutions repository for the given API client.
      */
    val institutions: InstitutionRepository[F] = new InstitutionRepository(api)

    /**
      * Provides the sharings repository for the given API client.
      */
    val sharings: SharingRepository[F] = new SharingRepository(api)

    /**
      * Provides the portfolios repository for the given API client.
      */
    val portfolios: PortfolioRepository[F] = new PortfolioRepository(api)

    /**
      * Provides the accounts repository for the given API client.
      */
    val accounts: AccountRepository[F] = new AccountRepository(api)

    /**
      * Provides the management fee schemes repository for the given API client.
      */
    val mfschemes: ManagementFeeSchemeRepository[F] = new ManagementFeeSchemeRepository(api)

    /**
      * Provides the analytical types repository for the given API client.
      */
    val analyticaltypes: AnalyticalTypeRepository[F] = new AnalyticalTypeRepository(api)

    /**
      * Provides the actions repository for the given API client.
      */
    val actions: ActionRepository[F] = new ActionRepository(api)

    /**
      * Provides the quants repository for the given API client.
      */
    val quants: QuantRepository[F] = new QuantRepository(api)

    /**
      * Provides the vouchers repository for the given API client.
      */
    val vouchers: VoucherRepository[F] = new VoucherRepository(api)

    /**
      * Provides the artifacts repository for the given API client.
      */
    val artifact: ArtifactRepository[F] = new ArtifactRepository(api)

    /**
      * Provides the OHLC series repository for the given API client.
      */
    val ohlcs: OHLCRepository[F] = new OHLCRepository[F](api)

    /**
      * Provides the OHLC observations repository for the given API client.
      */
    val ohlcObservations: OHLCObservationRepository[F] = new OHLCObservationRepository[F](api)

    /**
      * Provides the teams repository for the given API client.
      */
    val teams: TeamRepository[F] = new TeamRepository[F](api)
  }
}
