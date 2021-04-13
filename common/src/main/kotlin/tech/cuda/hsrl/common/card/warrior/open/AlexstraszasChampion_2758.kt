package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlexstraszasChampion_2758 : Card() {
    override val id = 2758
    override val name = "阿莱克丝塔萨的勇士"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便获得+1攻击力和<b>冲锋</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "“在她身上多装点刺。不，多装点刺。这四个字就这么难理解吗？快照我说的去做！”——阿莱克丝塔萨"
    override val artist = "Evgeniy Zaqumyennyy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b850a33b97bc4cce54aad4ab9399b1a8dc4ccebbf00778b1da07245ef175bb0.png"
}
