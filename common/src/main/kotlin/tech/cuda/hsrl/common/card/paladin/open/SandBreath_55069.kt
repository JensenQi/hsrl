package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SandBreath_55069 : Card() {
    override val id = 55069
    override val name = "沙尘吐息"
    override val description = "使一个随从获得+1/+2。如果你的手牌中有龙牌，使其获得<b>圣盾</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "从奥丹姆回来之后，每个人都能吐出点沙子来。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e4c2d8052ce340af3a7d731e7ee57745ade372737aba4f46b35475c9b17daa5.png"
}
