package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireBreather_61202 : Card() {
    override val id = 61202
    override val name = "吐火艺人"
    override val description = "<b>战吼：</b>对所有非恶魔随从造成2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“呼！那块骨头塞在牙缝里好久了！”"
    override val artist = "J. Cheung & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/667498796d505a7097a41805a1549b7ad788000bd167442fe56e9500ba12fccc.png"
}
