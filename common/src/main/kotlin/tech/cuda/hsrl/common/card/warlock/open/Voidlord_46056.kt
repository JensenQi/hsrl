package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Voidlord_46056 : Card() {
    override val id = 46056
    override val name = "虚空领主"
    override val description = "<b>嘲讽，亡语：</b> 召唤三个1/3并具有<b>嘲讽</b>的恶魔。"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他能让一切归于虚空，包括每个月的信用卡账单。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/36ef64c1997b61e74193ae5d4439fa97c131322db9710cfbeb4c3c6b6aebe92f.png"
}
