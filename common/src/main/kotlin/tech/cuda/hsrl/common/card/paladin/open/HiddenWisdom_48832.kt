package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HiddenWisdom_48832 : Card() {
    override val id = 48832
    override val name = "隐秘的智慧"
    override val description = "<b>奥秘：</b>当你的对手在一回合中使用三张牌后，抽两张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "你在寻找智慧？或许掉进沙发里面了。"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cdc437242114138d0e6bf14d29cd4d7d09240d887b71649c0cdfcad6a736faa3.png"
}
