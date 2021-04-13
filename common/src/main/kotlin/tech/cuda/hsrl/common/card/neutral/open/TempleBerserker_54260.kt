package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TempleBerserker_54260 : Card() {
    override val id = 54260
    override val name = "神殿狂战士"
    override val description = "<b>复生</b> 受伤时具有+2 攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "他回来了，他生气了，他要缠着你不放了。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14f266d2ca5037814f7f255536f8d1b2754e85065213ee949c0abe7362ea449a.png"
}
