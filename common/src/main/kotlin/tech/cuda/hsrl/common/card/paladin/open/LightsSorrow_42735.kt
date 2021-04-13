package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightsSorrow_42735 : Card() {
    override val id = 42735
    override val name = "光之悲恸"
    override val description = "在一个友方随从失去<b>圣盾</b>后，获得+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "这种悲伤刺痛的不光只是心。"
    override val artist = "Ben Thompson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c23e03be6f94521999c8acbda37d683b191e1f45fd314e1db29f84e73d4565d.png"
}
