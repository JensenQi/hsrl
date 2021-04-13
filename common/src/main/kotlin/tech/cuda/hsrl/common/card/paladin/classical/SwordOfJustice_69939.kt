package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwordOfJustice_69939 : Card() {
    override val id = 69939
    override val name = "公正之剑"
    override val description = "在你召唤一个随从后，使其获得+1/+1，这把武器失去1点耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "我封你为“牛腰肉爵士”！"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9eeb3b93b8902a2a957248b63ee25450e5503d6a87bdaeb8437ab9d8f5281a30.png"
}
