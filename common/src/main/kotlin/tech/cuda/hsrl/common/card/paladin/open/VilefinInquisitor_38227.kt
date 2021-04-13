package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VilefinInquisitor_38227 : Card() {
    override val id = 38227
    override val name = "邪鳍审判者"
    override val description = "<b>战吼：</b> 你的英雄技能变为“召唤一个1/1的鱼人”。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "这个鱼人掌握了很多审判技巧，待会你就知道厉害了！"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83eb4e4bc5d1aaaa8cf17b4b1fe12263b5f36edddc162ad8de9c2441c6aa22f6.png"
}
