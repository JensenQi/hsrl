package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SecondRateBruiser_40906 : Card() {
    override val id = 40906
    override val name = "二流打手"
    override val description = "<b>嘲讽</b> 如果你的对手控制至少三个随从，则其法力值消耗减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "等哪天适应了新配的隐形眼镜，他就会成为一流打手了。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89f4ef5de02c617a4258aa7d2da07bdf72b99962b3b6c41b2ea990ce0649f8d9.png"
}
