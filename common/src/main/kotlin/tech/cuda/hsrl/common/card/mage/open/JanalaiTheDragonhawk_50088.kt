package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JanalaiTheDragonhawk_50088 : Card() {
    override val id = 50088
    override val name = "加亚莱，龙鹰之神"
    override val description = "<b>战吼：</b> 在本局对战中，如果你的英雄技能累计造成了8点伤害，则召唤炎魔之王拉格纳罗斯。 <i>（还剩下 点！）</i> <i>（已经就绪！）</i>"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "你欺负龙鹰，就等于欺负我炎魔之王。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2b28f7cd5dda98caf683364f25852d07aa53b47dee73bb4e421df3e0ef4aef9.png"
}
