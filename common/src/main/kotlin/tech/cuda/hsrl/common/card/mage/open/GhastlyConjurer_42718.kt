package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GhastlyConjurer_42718 : Card() {
    override val id = 42718
    override val name = "鬼影巫师"
    override val description = "<b>战吼：</b>将一张“镜像”法术牌置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "听说，万圣节，紫色和鬼影更配哦！"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/59e4126ebea39a39a9b0b918cbfcf3c37b73cdc375203af577e9c69f997d8c3f.png"
}
