package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ReliquarySeeker_13334 : Card() {
    override val id = 13334
    override val name = "遗物搜寻者"
    override val description = "<b>战吼：</b>如果你拥有六个其他随从，便获得+4/+4。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Loe
    override val background = "神圣遗物学会自认为是一个非常专业的考古组织，可探险者协会却不这么认为。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f5cfdb7862513a3ce6e83ceaec6cdf345c7f575c73d8af15b616441e265fb47c.png"
}
