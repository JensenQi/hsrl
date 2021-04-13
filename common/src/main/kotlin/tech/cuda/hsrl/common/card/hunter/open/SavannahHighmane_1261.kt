package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SavannahHighmane_1261 : Card() {
    override val id = 1261
    override val name = "长鬃草原狮"
    override val description = "<b>亡语：</b>召唤两只2/2的土狼。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "在偌大丛林的生存游戏中，即使是狮子也会被成群的土狼拖垮。"
    override val artist = "Milivoj Ceran"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5368c1cf566b568b77821cd707a43fe1602f698c322af51dd0775957aacde73.png"
}
