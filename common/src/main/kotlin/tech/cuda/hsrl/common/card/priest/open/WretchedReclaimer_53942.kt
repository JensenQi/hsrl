package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WretchedReclaimer_53942 : Card() {
    override val id = 53942
    override val name = "卑劣的回收者"
    override val description = "<b>战吼：</b>消灭一个友方随从，然后将其复活，并具有所有生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“计划是这样的。我们先把你杀了，然后再把你复活。”“这样我就变强了？”“不，你还是原来的你。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d321053ab15c955e72cf008505892395caf75468464aa40f124fb241dee7aa60.png"
}
