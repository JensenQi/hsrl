package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchwoodImp_47262 : Card() {
    override val id = 47262
    override val name = "女巫森林小鬼"
    override val description = "<b>潜行，亡语：</b>随机使一个友方随从获得+2生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "如果你在森林里看到鬼火，多半是遇到了巡林的小鬼。"
    override val artist = "Kerem Beyit"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/07c61f9ee96a85c98c8fca1a9383275ececaa5105be74a1f4f3805de35323e85.png"
}
