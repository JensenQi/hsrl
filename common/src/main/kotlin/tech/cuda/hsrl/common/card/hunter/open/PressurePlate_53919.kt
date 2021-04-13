package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PressurePlate_53919 : Card() {
    override val id = 53919
    override val name = "压感陷阱"
    override val description = "<b>奥秘：</b>在你的对手施放一个法术后，随机消灭一个敌方 随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "要能像每天上秤时那么小心翼翼，就不会触发陷阱了。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e558278145e21c00e12801c5e7fd768f9fb0b666748c9b1bab0eb1ccb93fe30c.png"
}
