package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HenchClanBurglar_52112 : Card() {
    override val id = 52112
    override val name = "荆棘帮蟊贼"
    override val description = "<b>战吼：</b><b>发现</b>一张另一职业的法术牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "她可绝非宵小鼠辈。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3b78ebfb63d2a914d0e40c40b0658fd23514bf9beb5428e091617658e9d93a0a.png"
}
