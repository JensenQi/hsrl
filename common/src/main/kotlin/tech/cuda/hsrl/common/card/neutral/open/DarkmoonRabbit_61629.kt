package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkmoonRabbit_61629 : Card() {
    override val id = 61629
    override val name = "暗月兔子"
    override val description = "<b>突袭，剧毒</b> 同时对其攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 10
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "那不是普通的兔子！那是你见过的最粗野，最残暴，脾气最臭的啮齿类动物！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22661a8600687ad39f0b6ce1cce07db07430021a6943a52a2cae4134f8c30999.png"
}
