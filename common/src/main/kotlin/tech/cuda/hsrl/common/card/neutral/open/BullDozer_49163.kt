package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BullDozer_49163 : Card() {
    override val id = 49163
    override val name = "机械推土牛"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "放着不动两分钟后，会自动进入休眠模式。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/255399fce99497a951322094f13025fb99b4a93f5322aa472ad8c0368cc10af7.png"
}
