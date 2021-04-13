package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClockworkAutomaton_47439 : Card() {
    override val id = 47439
    override val name = "发条机器人"
    override val description = "使你的英雄技能的伤害和治疗效果翻倍。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "说谎鼻子会变长。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c6f52be516229b910b447125ad56fb91083add6811777f11feb5e1b0db22755.png"
}
