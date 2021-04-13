package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BenevolentDjinn_46258 : Card() {
    override val id = 46258
    override val name = "和蔼的灯神"
    override val description = "在你的回合结束时，为你的英雄恢复 3点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "第一个愿望是漏斗蛋糕，第二个愿望是漏斗蛋糕，第三个愿望……才不是更多的漏斗蛋糕呢，是更多的愿望，这样就可以有更多的漏斗蛋糕了！"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9876a31d275e0578f5d32373d077b2c761bd847b951526ede9538c84326722b8.png"
}
