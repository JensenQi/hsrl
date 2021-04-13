package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrandLackeyErkh_56135 : Card() {
    override val id = 56135
    override val name = "高级跟班厄尔克"
    override val description = "在你使用一张<b>跟班</b>牌后，将一张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "拉法姆手下备受尊重的人力资源部门主管，不过团队成员都不是<i>人</i>。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb57804762de319d612e9bcd5e31b984f148f412833c76e509abbdc8a169ca43.png"
}
