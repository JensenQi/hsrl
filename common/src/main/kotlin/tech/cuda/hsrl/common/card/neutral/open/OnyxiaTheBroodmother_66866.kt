package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OnyxiaTheBroodmother_66866 : Card() {
    override val id = 66866
    override val name = "龙巢之母奥妮克希亚"
    override val description = "在每个回合结束时，召唤数条1/1的雏龙，直到你的随从数量达到上限。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "快给她上dot，快上，再上，都给我上！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/28ec380d4a0a0c9adb1df0cc6c3862b49692112a70cf20ab8a85abf82676445b.png"
}
