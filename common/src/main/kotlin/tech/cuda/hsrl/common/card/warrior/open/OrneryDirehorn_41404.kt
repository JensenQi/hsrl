package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OrneryDirehorn_41404 : Card() {
    override val id = 41404
    override val name = "暴躁的恐角龙"
    override val description = "<b>嘲讽，战吼：</b><b>进化</b>。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "“食草恐龙有什么好怕的？”——某位探险者的遗言"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7114ced1aef6648692010aea3b0180078e708e6cc1d6d7bd466270c0568a79a1.png"
}
