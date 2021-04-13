package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GuardianAugmerchant_57182 : Card() {
    override val id = 57182
    override val name = "防护改装师"
    override val description = "<b>战吼：</b>对一个随从造成1点伤害并使其获得<b>圣盾</b>。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“只要你还有一口气在，就得给我结账！”"
    override val artist = "Alexa Rockman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01a5c41c122aa7aa13fab8917a8553682a83330d90dd29a5c0a6d6020904a369.png"
}
