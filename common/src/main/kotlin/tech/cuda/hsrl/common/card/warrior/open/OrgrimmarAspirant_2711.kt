package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OrgrimmarAspirant_2711 : Card() {
    override val id = 2711
    override val name = "奥格瑞玛狼骑士"
    override val description = "<b>激励：</b>使你的武器获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "“三个兽人里，有四个的数学是食人魔教的。”——愤怒的祖格"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/edd49510249ae49b13f3d2468ffff04c138c4208486e49e4b5414a6ad8d675b3.png"
}
