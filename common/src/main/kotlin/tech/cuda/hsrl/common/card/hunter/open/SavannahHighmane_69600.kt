package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SavannahHighmane_69600 : Card() {
    override val id = 69600
    override val name = "长鬃草原狮"
    override val description = "<b>亡语：</b>召唤两只2/2的土狼。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "在偌大丛林的生存游戏中，即使是狮子也会被成群的土狼拖垮。"
    override val artist = "Milivoj Ceran"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d606557ec6c2dc77f081eada60452660268b6b76e7ecc92e5b03d518fb54db3.png"
}
