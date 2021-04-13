package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NorthwatchCommander_62927 : Card() {
    override val id = 62927
    override val name = "北卫军指挥官"
    override val description = "<b>战吼：</b> 如果你控制一个<b>奥秘</b>，抽一张随从牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "北卫军原本牢不可破。直到某一天，狡猾的部落从南边摸了过来。"
    override val artist = "Leonardo Santanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/633c10d93eb8c93a90194f0bf908c2fbbf57650302aa645c8a843fde42267005.png"
}
