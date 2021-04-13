package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rimetongue_63112 : Card() {
    override val id = 63112
    override val name = "霜舌半人马"
    override val description = "在你施放一个冰霜法术后，召唤一个1/1的可以<b>冻结</b>攻击目标的 元素。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "战士红，冰法蓝，被霜舌抓到就玩完。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5fe8852a6da054896d2bb79129c3cd3b7c315e29edec3b4f5465f89d3120188c.png"
}
