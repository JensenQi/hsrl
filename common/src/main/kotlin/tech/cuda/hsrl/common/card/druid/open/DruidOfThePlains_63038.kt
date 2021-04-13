package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfThePlains_63038 : Card() {
    override val id = 63038
    override val name = "平原德鲁伊"
    override val description = "<b>突袭</b>，<b>暴怒：</b>变形成为一只6/7并具有<b>嘲讽</b>的科多兽。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "磕得多了，就变成了科多兽。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e5b548136bd5c1a15b8a6cd7dd31d57afbc3749599036125effaed5e79fb2fc.png"
}
