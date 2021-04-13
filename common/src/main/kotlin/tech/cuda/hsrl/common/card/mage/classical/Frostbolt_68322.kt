package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Frostbolt_68322 : Card() {
    override val id = 68322
    override val name = "寒冰箭"
    override val description = "对一个角色造成 3点伤害，并使其<b>冻结</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "在你用这张牌的时候，你可以随意喊出一些咒语，比如“冻住！”“冻结！”或者“结冰，结冰吧，宝贝儿！”"
    override val artist = "Steve Ellis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b12df9e47a6938d5f11106025710aed9fe69b6ec9dd77ef0d0dc489fdb18bbfc.png"
}
