package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Troublemaker_59175 : Card() {
    override val id = 59175
    override val name = "问题学生"
    override val description = "在你的回合结束时，召唤两个3/3的无赖并使其攻击随机敌人。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“既然你诚心诚意地发问了！”“我们就大发慈悲地告诉你！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a4e344455aecf1b701aa5114701412e16daceda169e109386d1d7a01bc70f9a.png"
}
