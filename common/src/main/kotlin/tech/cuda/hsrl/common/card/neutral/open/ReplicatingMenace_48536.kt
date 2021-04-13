package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ReplicatingMenace_48536 : Card() {
    override val id = 48536
    override val name = "量产型恐吓机"
    override val description = "<b>磁力</b> <b>亡语：</b>召唤三个1/1的微型机器人。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "我来组成头部！ 我来组成躯干！ 我来组成……"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e42130fff24f8e989dfe94313e854a4d80a923aa06b773aae6187cffcbde8e4.png"
}
