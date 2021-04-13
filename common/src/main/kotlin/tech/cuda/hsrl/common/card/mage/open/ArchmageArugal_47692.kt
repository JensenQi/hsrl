package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArchmageArugal_47692 : Card() {
    override val id = 47692
    override val name = "大法师阿鲁高"
    override val description = "每当你抽到一张随从牌，将一张它的复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "他的孩子们都管他叫啊呜高。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/893150fcdbb979e3f8d73ee2bfdcfe0a45c8b64f681aa60e0fedb2125e451bd9.png"
}
