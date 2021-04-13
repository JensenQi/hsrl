package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerOverwhelming_846 : Card() {
    override val id = 846
    override val name = "力量的代价"
    override val description = "使一个友方随从获得+4/+4，该随从会在回合结束时死亡。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy4
    override val background = "别让那个随从知道他死后的样子。那惨象无可言状。"
    override val artist = "Tom Baxa"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d771ec01ffa6da877b5ba391264f7b797fdf48b141716f068f13a62bf0b9c87c.png"
}
