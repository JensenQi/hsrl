package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RecurringVillain_52943 : Card() {
    override val id = 52943
    override val name = "再生大盗"
    override val description = "<b>亡语：</b>如果该随从的攻击力大于或等于4，则再次召唤该随从。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "哇哈哈哈！这次你永远也别想抓住他了！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34764e6d4510b80d4aa4e239ef7769638260b862a4114a9f54a283764abab479.png"
}
