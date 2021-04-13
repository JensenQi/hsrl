package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkyGenralKragg_56307 : Card() {
    override val id = 56307
    override val name = "天空上将库拉格"
    override val description = "<b>嘲讽，战吼：</b>如果你在本局对战中使用过<b>任务</b>，则召唤一只4/2并具有<b>突袭</b>的鹦鹉。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "他的下一个目标是天空元帅。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee3193e3cbff6cd2f9a07a99cfb92e6bd4b38de5ec7c1e94f4b1ef6d78f13536.png"
}
