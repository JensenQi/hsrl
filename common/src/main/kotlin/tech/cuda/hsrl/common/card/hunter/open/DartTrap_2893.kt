package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DartTrap_2893 : Card() {
    override val id = 2893
    override val name = "毒镖陷阱"
    override val description = "<b>奥秘：</b> 在对方使用英雄技能后，随机对一个敌人造成 5点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Loe
    override val background = "苦练了5年的踢踏舞今天终于能派上用场啦！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d9bd77b22742a786b9096f1173402b38e45b52f953be230313f156fcbe3c795e.png"
}
