package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LilianVoss_43031 : Card() {
    override val id = 43031
    override val name = "莉莉安·沃斯"
    override val description = "<b>战吼：</b>随机将你手牌中所有的法术牌替换成<i>（你对手职业的）</i>法术牌。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "她不会可惜，不会后悔，不会恐惧。她也绝不会停止……直到死灵法师全部死去。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b753a1c2da7ea093f387f3ef084935cd65f990c08419363fa8b1dcfd4c9be32.png"
}
