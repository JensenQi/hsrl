package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AbyssalSummoner_54894 : Card() {
    override val id = 54894
    override val name = "深渊召唤者"
    override val description = "<b>战吼：</b>召唤一个属性值等同于你的手牌数量并具有<b>嘲讽</b>的恶魔。"
    override var cost: Int? = 6
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "可是侏儒的手太小了，根本握不住几张牌……"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2e7276855793d4b4b71ef309306f489d6473528583390b4a459fbb1f75cb04bd.png"
}
