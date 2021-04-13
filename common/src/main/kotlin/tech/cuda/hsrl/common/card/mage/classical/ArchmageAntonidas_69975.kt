package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchmageAntonidas_69975 : Card() {
    override val id = 69975
    override val name = "大法师安东尼达斯"
    override val description = "每当你施放一个法术，将一张“火球术”法术牌置入你的手牌。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "肯瑞托的首席法师，达拉然最伟大的子民，安东尼达斯在被巫妖王阿尔萨斯杀死之前，曾是吉安娜的导师。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c23a9c0814703bccd0fae669ea5db85e9aa6644233b77d31d1e93ce21f6b9453.png"
}
