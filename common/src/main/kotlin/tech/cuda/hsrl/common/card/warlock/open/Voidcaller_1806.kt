package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Voidcaller_1806 : Card() {
    override val id = 1806
    override val name = "空灵召唤者"
    override val description = "<b>亡语：</b> 随机将一张恶魔牌从你的手牌置入战场。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Naxx
    override val background = "“虚空！别调皮了，为师叫你呢，过来吧，虚空！”"
    override val artist = "Robb Shoberg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a63f62e74e9dde9036c7a3676985833461206624bcc72050f6e81ba0c235e6b7.png"
}
