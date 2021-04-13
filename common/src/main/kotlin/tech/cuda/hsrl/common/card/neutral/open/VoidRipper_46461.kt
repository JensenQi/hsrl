package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoidRipper_46461 : Card() {
    override val id = 46461
    override val name = "虚空撕裂者"
    override val description = "<b>战吼：</b> 使所有其他随从的攻击力和生命值互换。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "你是把携带式次元洞放到了次元袋里了吗？"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c67a0fd77b29a71f77f418d56b4b684d73d11d182b2cd6b35d839b11b0a85ca4.png"
}
