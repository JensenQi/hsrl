package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BurlyShovelfist_53024 : Card() {
    override val id = 53024
    override val name = "推土壮汉"
    override val description = "<b>突袭</b>"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "铁铲子能裁布，还能砸石头！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60435158d924cd8e94e0a8d139e62bd3a510487f32f4e2c17df4ce7382b89c96.png"
}
