package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SacredTrial_2899 : Card() {
    override val id = 2899
    override val name = "审判"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，如果他控制至少三个随从，则将其消灭。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Loe
    override val background = "你的选择…是错的。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa7413b117e337efd6d6dfc8d8c5140595f886333d9efdd386d469527bff8e1c.png"
}
