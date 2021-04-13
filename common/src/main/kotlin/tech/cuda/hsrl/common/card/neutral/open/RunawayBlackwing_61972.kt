package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RunawayBlackwing_61972 : Card() {
    override val id = 61972
    override val name = "窜逃的黑翼龙"
    override val description = "在你的回合结束时，随机对一个敌方随从造成9点伤害。"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "距离艾泽拉斯联赛的上一次事故已经过去整整5分钟了。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3dc322a17fc772ca92174f4c3d7132797d170dfb0aa999fe81eb07e4f53da7c5.png"
}
