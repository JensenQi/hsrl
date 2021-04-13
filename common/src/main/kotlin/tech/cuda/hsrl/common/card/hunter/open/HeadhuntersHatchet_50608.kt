package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeadhuntersHatchet_50608 : Card() {
    override val id = 50608
    override val name = "猎头者之斧"
    override val description = "<b>战吼：</b>如果你控制一个野兽，便获得+1耐久度。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "祖尔金就是用这把斧头来招揽随从的。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9381a92af62fdb37145ecaa5f5f670ef9b5bbd03ed3bdf6484fce596745535ea.png"
}
