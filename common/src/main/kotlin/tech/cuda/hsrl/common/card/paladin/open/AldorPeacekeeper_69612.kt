package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AldorPeacekeeper_69612 : Card() {
    override val id = 69612
    override val name = "奥尔多卫士"
    override val description = "<b>战吼：</b>使一个敌方随从的攻击力变为1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "奥尔多痛恨两样东西：占星者和湿鳞蜥蜴的眼睛。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0943f8d1f18bea39fefecf11355adafa6cc9fe2b266f0c8c743721396c1c724f.png"
}
