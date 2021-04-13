package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WalkingFountain_51722 : Card() {
    override val id = 51722
    override val name = "活动喷泉"
    override val description = "<b>吸血，突袭，风怒</b>"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "没事？没事走两步！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/508fa61c09a1f1ce138b546662ae40a484f6b5e19adcfe5cfb08e450a9ce48ce.png"
}
