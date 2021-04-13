package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerOverwhelming_69921 : Card() {
    override val id = 69921
    override val name = "力量的代价"
    override val description = "使一个友方随从获得+4/+4，该随从会在回合结束时死亡。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "别让那个随从知道他死后的样子。那惨象无可言状。"
    override val artist = "Tom Baxa"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c16796687fcae2e0408d425629941636e6d6211fa9dacc25e605a36ffb6b057f.png"
}
