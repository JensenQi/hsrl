package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DesertObelisk_54288 : Card() {
    override val id = 54288
    override val name = "沙漠方尖碑"
    override val description = "如果你在你的回合结束时控制3座沙漠方尖碑，随机对一个敌人造成5点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "群星方尖碑可以将一整块地区隐藏起来！也可以用来造成随机的伤害。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4297c25832976cf4c59dd569c4302c13d8c2e9be39da42387614119c80327bf.png"
}
