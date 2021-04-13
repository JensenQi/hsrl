package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EtherealArcanist_1737 : Card() {
    override val id = 1737
    override val name = "虚灵奥术师"
    override val description = "如果在你的回合结束时，你控制一个<b>奥秘</b>，该随从便获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "虚灵们浑身捆绑着布条，不仅是因为布料柔软舒适，更是为了让他们的外表更能为其他种族接受。"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e97193ce1a0fcba734be188f77a992be3a69415d44c3472ae39333d18c58d00.png"
}
