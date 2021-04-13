package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForbiddenFlame_38413 : Card() {
    override val id = 38413
    override val name = "禁忌烈焰"
    override val description = "消耗你所有的法力值，对一个随从造成等同于所消耗法力值数量的伤害。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "警告：只有持有上古之神所颁发的侍僧执照才可以使用禁忌烈焰，否则后果自负！"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7f34c77c639f2a460fc0a5e7d275c6c54314b7b66f1f66c1b087b050b2af84e.png"
}
