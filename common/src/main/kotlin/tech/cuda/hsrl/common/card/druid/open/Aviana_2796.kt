package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Aviana_2796 : Card() {
    override val id = 2796
    override val name = "艾维娜"
    override val description = "你的随从牌的法力值消耗为（1）点。"
    override var cost: Int? = 10
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "她最喜欢别人说她像翠迪了，我保证。"
    override val artist = "Velvet Engine"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4309ef33fb41b26aea89ecf5d415a8b07a71cf0f543f6e4f66fd64620b351afb.png"
}
