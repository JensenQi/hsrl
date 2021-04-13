package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AldorPeacekeeper_69941 : Card() {
    override val id = 69941
    override val name = "奥尔多卫士"
    override val description = "<b>战吼：</b>使一个敌方随从的攻击力变为1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "奥尔多痛恨两样东西：占星者和湿鳞蜥蜴的眼睛。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/feb26d8de2b1de46ad92ca254c123e9e5e5bf343be4eef17ff00586e2ecbb7c5.png"
}
