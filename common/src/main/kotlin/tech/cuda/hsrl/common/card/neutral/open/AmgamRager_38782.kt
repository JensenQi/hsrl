package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AmgamRager_38782 : Card() {
    override val id = 38782
    override val name = "浆岩暴怒者"
    override val description = ""
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "俗话说怨由心生，可这家伙根本就没有心，哪儿来的这么多恨……"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8af4375694cfe9960a8bbbc6979c0b2bd7c9e76ac022012ae840baf7e85bfc6c.png"
}
