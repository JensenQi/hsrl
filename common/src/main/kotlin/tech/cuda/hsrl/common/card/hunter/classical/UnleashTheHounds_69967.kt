package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnleashTheHounds_69967 : Card() {
    override val id = 69967
    override val name = "关门放狗"
    override val description = "战场上每有一个敌方随从，便召唤一个 1/1并具有<b>冲锋</b>的猎犬。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "在你使用这张牌的时候，一定要喊出它的名字。"
    override val artist = "Linggar Bramanty"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c320c7d544d8ab30f98b73744e441c1dec263dca790584842d04c75258b6260c.png"
}
