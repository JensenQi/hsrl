package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CurioCollector_47429 : Card() {
    override val id = 47429
    override val name = "古董收藏家"
    override val description = "每当你抽一张牌时，便获得+1/+1。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "外界怀疑面具收集者就是通过他来进行销赃的。"
    override val artist = "Alex Konstad"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c38ca360b3bf01812f6d327f9831e36b86d4964d56fbe6ddc94d2321df1d7bc6.png"
}
