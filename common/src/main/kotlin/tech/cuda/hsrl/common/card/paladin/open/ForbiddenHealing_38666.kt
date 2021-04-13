package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForbiddenHealing_38666 : Card() {
    override val id = 38666
    override val name = "禁忌治疗"
    override val description = "消耗你所有的法力值，恢复等同于所消耗法力值数量两倍的生命值。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "人人都爱治疗术。可禁忌治疗……听起来有些不靠谱。"
    override val artist = "Mike Franchina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05cdfc0e7fd0cae53575d36a9e20ad5e18ad564bd168b43f3cc9b38595034c3c.png"
}
