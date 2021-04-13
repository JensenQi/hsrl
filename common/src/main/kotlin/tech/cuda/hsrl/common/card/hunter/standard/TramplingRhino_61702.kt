package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TramplingRhino_61702 : Card() {
    override val id = 61702
    override val name = "狂踏的犀牛"
    override val description = "<b>突袭</b> 在该随从攻击并消灭一个随从后，超过目标生命值的伤害会命中敌方英雄。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "奔跑的犀牛，像一个人在梦游。不打到英雄不罢休。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6508c5dfa380acbfb616408afab6cefa6656d24c4f00dd708e5abe1d6c0e3d33.png"
}
