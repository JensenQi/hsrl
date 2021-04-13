package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KlaxxiAmberWeaver_38621 : Card() {
    override val id = 38621
    override val name = "卡拉克西织珀者"
    override val description = "<b>战吼：</b> 如果你的克苏恩至少具有10点攻击力，便获得+5生命值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Wotog
    override val background = "琥珀编织技术只有在特殊的职业技校才能学到。"
    override val artist = "Cole Eastburn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8b22461c8dc227c306e6386db40898a273d9d8bd701b702fafe8166c525030f6.png"
}
