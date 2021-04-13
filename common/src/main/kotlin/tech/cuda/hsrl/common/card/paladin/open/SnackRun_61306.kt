package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnackRun_61306 : Card() {
    override val id = 61306
    override val name = "零食大冲关"
    override val description = "<b>发现</b>一张法术牌。为你的英雄恢复等同于其法力值消耗的生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我的冲关目标是两份怪兽油饼，一个尤格-萨隆的连击之匣，还有一根火鸡腿，能吃掉白银之手新兵的火鸡腿。”"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9cd8d6661d8a8570e35c6865bc8881a8182ce59e9ada807cb054f2007c1ecc52.png"
}
