package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarkedShot_52070 : Card() {
    override val id = 52070
    override val name = "标记射击"
    override val description = "对一个随从造成 4点伤害。<b>发现</b>一张法术牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“战术目镜启动！”"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/995fbe3927dbd4e653c3504e2eaaf8042a279cec5de91f2622862eb1dca57a2d.png"
}
