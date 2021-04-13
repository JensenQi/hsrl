package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoongladePortal_39714 : Card() {
    override val id = 39714
    override val name = "月光林地传送门"
    override val description = "恢复 6点生命值。随机召唤一个法力值消耗为（6）的 随从。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Karazhan
    override val background = "没人想去月光林地开派对，因为那里有熊出没。"
    override val artist = "Evgeniy Zaqumyennyy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8cd9ae2eb0c6096ff94f6149ea35d36e714f775e39aea58512c1ee5f20dda13c.png"
}
