package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwordOfJustice_643 : Card() {
    override val id = 643
    override val name = "公正之剑"
    override val description = "在你召唤一个随从后，使其获得+1/+1，这把武器失去1点耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "我封你为“牛腰肉爵士”！"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b99562b00feabe10501667bf5ee041f6ee2081de0f0c33e8a57da7cd5ee36820.png"
}
