package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mankrik_63591 : Card() {
    override val id = 63591
    override val name = "曼科里克"
    override val description = "<b>战吼：</b>帮助曼科里克寻找他的妻子！她曾出现在你牌库中的某个地方。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "玩家每创建一个部落角色，他的噩梦便会重演一遍。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d6d19ff5470ffc8bea2c35e86929554300a9278b39174079df1b9454aebe801.png"
}
