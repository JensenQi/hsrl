package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gazlowe_2085 : Card() {
    override val id = 2085
    override val name = "加兹鲁维"
    override val description = "每当你施放一个法力值消耗为（1）的法术，随机将一张机械牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "在学校里，加兹鲁维就被认为是“最能制造混乱的人”。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb1bd06e30dab18d146af003f659d82063e541ad2cddcc7f20208500024cdca5.png"
}
