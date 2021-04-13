package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadHatter_46674 : Card() {
    override val id = 46674
    override val name = "疯帽客"
    override val description = "<b>战吼：</b>随机向其他随从丢出三顶帽子。每顶帽子可使随从获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "他看起来疯疯癫癫的，可又有哪个地精不是呢……"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69cff2225f0e245f20ee823f8a5917b1333d9e28807fab7005605cc571bd4be3.png"
}
