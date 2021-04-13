package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CommandingShout_1026 : Card() {
    override val id = 1026
    override val name = "命令怒吼"
    override val description = "在本回合中，你的随从的生命值无法被降到1点以下。抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "“大声吼出来！把你的怒气吼出来！”——对训练中的战士的建议"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c155a04b87b5e9a895ca65a8276ef5293873f21eca339fa4035d7d2968938639.png"
}
