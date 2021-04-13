package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LordGodfrey_48156 : Card() {
    override val id = 48156
    override val name = "高弗雷勋爵"
    override val description = "<b>战吼：</b>对所有其他随从造成2点伤害。如果有随从死亡，则重复此<b>战吼</b>效果。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "他背叛过联盟，背叛过部落。只为了200点成就点数，和那顶漂亮的帽子！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19e34b37429912a166c104ed2fd465d045baaec4f6614948f51128bd7c6c63c3.png"
}
