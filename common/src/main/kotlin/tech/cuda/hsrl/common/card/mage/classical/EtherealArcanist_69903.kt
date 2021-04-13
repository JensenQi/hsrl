package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EtherealArcanist_69903 : Card() {
    override val id = 69903
    override val name = "虚灵奥术师"
    override val description = "如果在你的回合结束时，你控制一个<b>奥秘</b>，该随从便获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "虚灵们浑身捆绑着布条，不仅是因为布料柔软舒适，更是为了让他们的外表更能为其他种族接受。"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d02b9e5ace43dd51d62999e7fc43fd3b6776d8a40ea7fb4deff0dec6a570b54a.png"
}
