package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExtraArms_48101 : Card() {
    override val id = 48101
    override val name = "增生手臂"
    override val description = "使一个随从获得+2/+2。将一张可使一个随从获得+2/+2的“更多手臂”置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "让我好好抱抱你！"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1f1d50376036478856fa1e09f1737c02059fe71f9f8a82c54ebb80de6b925d2f.png"
}
