package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EydisDarkbane_2519 : Card() {
    override val id = 2519
    override val name = "黑暗邪使艾蒂丝"
    override val description = "每当<b>你</b>以该随从为目标施放一个法术时，便随机对一个敌人造成3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "她最恨被别人叫“邪使姐妹花”了。"
    override val artist = "Ben Thompson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dde043b68d996bf753e85540098b487ec24d0bac536a744ad46416701bc3521b.png"
}
