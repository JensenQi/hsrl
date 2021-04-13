package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoboglideTech_55404 : Card() {
    override val id = 55404
    override val name = "地精滑翔技师"
    override val description = "<b>战吼：</b>如果你控制一个机械，便获得+1/+1和<b>突袭</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "操作手册中出现的所有“滑翔”字样都打了双引号。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c450f082e46784120953ae49bee5f2c9297c2933f915fd531cb93eaba19e79aa.png"
}
