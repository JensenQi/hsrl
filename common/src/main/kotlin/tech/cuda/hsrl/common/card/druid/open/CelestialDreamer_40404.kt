package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CelestialDreamer_40404 : Card() {
    override val id = 40404
    override val name = "天神唤梦者"
    override val description = "<b>战吼：</b>如果你控制一个攻击力大于或等于5的随从，便获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "别以为这是份好工作，其实成天睡觉也挺无聊的。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ddc8b8422364b81802eba5960dfa589a8bbd55e558de908daf17921f5b6bee0.png"
}
