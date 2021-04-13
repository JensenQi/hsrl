package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TameBeastRank1_63002 : Card() {
    override val id = 63002
    override val name = "驯服野兽（等级1）"
    override val description = "召唤一只2/2并具有<b>突袭</b>的野兽。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“相信我，宝贝儿，我从没吃过你们海鲜！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66ffdc6cc3d4698caca2519a4d6e3195969550da9564e5d7a8d1cbfa9f52c0fe.png"
}
