package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeadhuntersHatchet_69695 : Card() {
    override val id = 69695
    override val name = "猎头者之斧"
    override val description = "<b>战吼：</b>如果你控制一个野兽，便获得+1耐久度。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "祖尔金就是用这把斧头来招揽随从的。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4488c99935eaddc964c1ea12909a9301998d18d7594704098ef4a6313494755a.png"
}
