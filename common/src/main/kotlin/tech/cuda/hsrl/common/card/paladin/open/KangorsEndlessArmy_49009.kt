package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KangorsEndlessArmy_49009 : Card() {
    override val id = 49009
    override val name = "坎格尔的无尽大军"
    override val description = "复活三个友方机械，它们会保留所有<b>磁力</b>升级。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.BoomsdayProject
    override val background = "一生二，二生三，三生无尽。"
    override val artist = "Dai Yang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc127010acdb95fcdd9354e66e093c5ea8f24fe71f31137db4a5498d16b55906.png"
}
