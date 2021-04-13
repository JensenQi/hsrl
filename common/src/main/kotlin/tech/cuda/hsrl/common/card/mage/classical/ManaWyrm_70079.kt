package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaWyrm_70079 : Card() {
    override val id = 70079
    override val name = "法力浮龙"
    override val description = "每当你施放一个法术，便获得 +1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "这些法力浮龙以奥术能量为食。所以尽管这些捣蛋鬼不会成为真正的威胁，你也不应该让它们接近任何法术力源。"
    override val artist = "Blizzard Cinematics"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/78910ac2ae92fee75386c956c5d79a5c375c7f1cf52efcb76d41002293e3f36f.png"
}
