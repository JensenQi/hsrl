package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaWyrm_405 : Card() {
    override val id = 405
    override val name = "法力浮龙"
    override val description = "每当你施放一个法术，便获得 +1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "这些法力浮龙以奥术能量为食。所以尽管这些捣蛋鬼不会成为真正的威胁，你也不应该让它们接近任何法术力源。"
    override val artist = "Blizzard Cinematics"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6554b1fd0823bcbf49298b46a76bbeb924539bd2a1bc3ae7ff0450c6041b51ac.png"
}
