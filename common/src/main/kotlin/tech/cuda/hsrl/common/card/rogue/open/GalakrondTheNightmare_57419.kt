package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GalakrondTheNightmare_57419 : Card() {
    override val id = 57419
    override val name = "梦魇巨龙迦拉克隆"
    override val description = "<b>战吼：</b>抽一张牌，其法力值消耗为（0）点。<i>（ ）</i>"
    override var cost: Int? = 7
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "恶龙张开了毒液淋漓的恐怖巨爪。托瓦格尔国王面露喜色，但心下仍有些许失望，因为梦魇巨龙拒绝在头顶戴上蜡烛。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4dec05cc3ac23b220079c9d7312e7e6a20be4b8fd81ed93b6780cb9e0293837e.png"
}
